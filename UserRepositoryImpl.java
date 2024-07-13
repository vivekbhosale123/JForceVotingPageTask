package org.techhub.VotingAppsApplications.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techhub.VotingAppsApplications.Model.User;

@Repository("uRepo")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    JdbcTemplate template;

    @SuppressWarnings("deprecation")
	@Override
    public User findByUsernameAndPassword(String username, String password) 
    {
        String sql = "select * from users where username = ? and password = ?";
        return template.queryForObject(sql, new Object[]{username, password}, 
            new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return new User(rs.getLong("id"), rs.getString("username"), rs.getString("password"),
                        rs.getString("email"), rs.getString("phoneNo"));
                }
            });
    }

    @Override
    public void save(User user) 
    {
        String sql = "insert into users (username, password, email, phoneNo) values (?, ?, ?, ?)";
        template.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getPhoneNo());
    }

    @Override
    public Long findUserIdByUsername(String username) 
    {
        String sql = "select id from users where username = ?";
        return template.queryForObject(sql, new Object[]{username}, Long.class);
    }

    @Override
    public boolean hasVoted(Long userId) 
    {
        String sql = "select count(*) from votes where user_id = ?";
        Integer count = template.queryForObject(sql, new Object[]{userId}, Integer.class);
        return count > 0;
    }
}
