package sddtc.couple.mappers;

import sddtc.couple.dao.domain.CoupleFeed;
import sddtc.couple.request.CoupleFeedRequest;

import java.util.List;

/**
 * Created by sddtc on 16/5/2.
 */
public interface CoupleFeedMapper {

    List<CoupleFeed> query(CoupleFeedRequest request);

    void insert(CoupleFeed feed);
}
