package myself.po;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id",columnDefinition = "int(11) COMMENT '用户id'")
    private Long userId;
    @Column(name = "user_name",unique = true,columnDefinition = "varchar(200) COMMENT '用户名'")
    private String userName;
    @Column(name = "password",columnDefinition = "varchar(20) COMMENT '密码'")
    private String password;
    @Column(name = "parent_id",columnDefinition = "int(11) COMMENT '父id'")
    private Long parentId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
