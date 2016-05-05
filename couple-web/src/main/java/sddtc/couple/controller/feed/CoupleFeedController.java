package sddtc.couple.controller.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sddtc.couple.controller.BaseController;
import sddtc.couple.dao.domain.CoupleFeed;
import sddtc.couple.response.CoupleFeedResponse;
import sddtc.couple.service.feed.CoupleFeedServiceImpl;
import sddtc.couple.request.CoupleFeedRequest;

import java.util.List;

/**
 * Created by sddtc on 16/5/2.
 */
@Controller
@RequestMapping(value = "/feed")
public class CoupleFeedController extends BaseController {
    @Autowired
    private CoupleFeedServiceImpl coupleFeedService;

    @RequestMapping(value = "/{roleId}")
    @ResponseBody
    public String query(CoupleFeedRequest request) {
        CoupleFeedResponse response = new CoupleFeedResponse();

        List<CoupleFeed> feedList = coupleFeedService.query(request);
        response.setFeedList(feedList);

        return gson.toJson(response);
    }

    @RequestMapping(value="/insert")
    @ResponseBody
    public String insert(CoupleFeed feed) {
        CoupleFeedResponse response = new CoupleFeedResponse();

        coupleFeedService.insert(feed);

        return gson.toJson(response);
    }
}
