package sddtc.couple.request;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleFeedRequest {
    private long roleId;
    private long creatorId;
    private long replyFeedId;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
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
}
