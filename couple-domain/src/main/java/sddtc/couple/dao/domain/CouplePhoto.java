package sddtc.couple.dao.domain;

/**
 * Created by sddtc on 16/5/2.
 */
public class CouplePhoto {
    private long id;
    private long memberId;
    private int memberType;
    private int type;
    private int size;
    private String url;
    private int isDeleted;
    private long created;
    private long updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public int getMemberType() {
        return memberType;
    }

    public void setMemberType(int memberType) {
        this.memberType = memberType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return "CouplePhoto{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", memberType=" + memberType +
                ", type=" + type +
                ", size=" + size +
                ", url='" + url + '\'' +
                ", isDeleted=" + isDeleted +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
