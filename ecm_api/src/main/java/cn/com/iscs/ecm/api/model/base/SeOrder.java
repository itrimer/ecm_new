package cn.com.iscs.ecm.api.model.base;

/**
 * Created by xuchun on 16/2/23.
 */
public class SeOrder {
    private Long id;
    private String name;
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {//
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}