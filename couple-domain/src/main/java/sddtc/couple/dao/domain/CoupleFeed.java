package sddtc.couple.dao.domain;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleFeed {
    private long id;
    private long roleId;
    private String content;
    private long creatorId;
    private long replyFeedId;
    private int isDeleted;
    private long created;
    private long updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }

    public long getReplyFeedId() {
        return replyFeedId;
    }

    public void setReplyFeedId(long replyFeedId) {
        this.replyFeedId = replyFeedId;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "CoupleFeed{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", content='" + content + '\'' +
                ", creatorId=" + creatorId +
                ", replyFeedId=" + replyFeedId +
                ", isDeleted=" + isDeleted +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
