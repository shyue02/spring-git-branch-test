package site.metacoding.firstapp.domain.user;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String email;
    private String nickName;
    private Timestamp createdAt;
}