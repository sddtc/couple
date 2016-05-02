package sddtc.couple.request;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleRoleRequest {
    private long id;
    private long creatorId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }
}
