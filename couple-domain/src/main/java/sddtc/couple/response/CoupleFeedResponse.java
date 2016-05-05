package sddtc.couple.response;

import sddtc.couple.BaseResult;
import sddtc.couple.dao.domain.CoupleFeed;

import java.util.List;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleFeedResponse extends BaseResult {
    private List<CoupleFeed> feedList;

    public List<CoupleFeed> getFeedList() {
        return feedList;
    }

    public void setFeedList(List<CoupleFeed> feedList) {
        this.feedList = feedList;
    }

    @Override
    public String toString() {
        return "CoupleFeedResponse{" +
                "feedList=" + feedList +
                '}';
    }
}
