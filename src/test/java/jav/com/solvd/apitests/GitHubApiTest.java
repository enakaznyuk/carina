package jav.com.solvd.apitests;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.solvd.apitests.DeleteMethod;
import com.solvd.apitests.GetMethodForRepBranches;
import com.solvd.apitests.GetMethodForUser;
import com.solvd.apitests.PostMethodForRepBranch;
import org.testng.annotations.Test;


public class GitHubApiTest {

    @Test(testName = "check get user method")
    public void checkGetUserTest() {
        GetMethodForUser getUserMethod = new GetMethodForUser(null, "api.users/rs.json");
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

    @Test(testName = "check delete repo method")
    public void checkDeleteRepoTest() {
        DeleteMethod deleteRepoMethod = new DeleteMethod();
        deleteRepoMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        deleteRepoMethod.callAPI();
    }
    @Test(testName = "check get repo method")
    public void checkGetRepoBranchTest() {
        GetMethodForRepBranches getRepoMethod = new GetMethodForRepBranches(null, "api.repository/_get/rs.json");
        getRepoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getRepoMethod.callAPI();
    }

    @Test(testName = "check create repo method")
    public void checkPostMethodForRepBranchTest() {
        PostMethodForRepBranch postRepoMethod = new PostMethodForRepBranch("api.repository/_post/rq.json",
                "api.repository/_post/rs.json");
        postRepoMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        postRepoMethod.expectResponseStatus(HttpResponseStatusType.UNAUTHORIZED_401);
        postRepoMethod.callAPI();
        postRepoMethod.validateResponse();
    }
}
