package site.metacoding.firstapp.domain.user;

import java.util.List;

public interface UserDao {
    public User findById(Integer usereId);
    public List<User> findAll(Integer userId);
    public void insert(User user);
    public void update(User user);
    public void delete(Integer userId);
}
