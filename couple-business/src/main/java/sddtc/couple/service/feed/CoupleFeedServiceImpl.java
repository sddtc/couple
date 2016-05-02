package sddtc.couple.service.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sddtc.couple.dao.domain.CoupleFeed;
import sddtc.couple.mappers.CoupleFeedMapper;
import sddtc.couple.request.CoupleFeedRequest;

import java.util.List;

/**
 * Created by sddtc on 16/5/2.
 */
@Service
public class CoupleFeedServiceImpl {
    @Autowired
    private CoupleFeedMapper coupleFeedMapper;

    public List<CoupleFeed> query(CoupleFeedRequest request) {
        return coupleFeedMapper.query(request);
    }

    public void insert(CoupleFeed feed) {
        coupleFeedMapper.insert(feed);
    }
}
