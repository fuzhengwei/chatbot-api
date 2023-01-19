package cn.bugstack.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author 小傅哥，微信：fustack
 * @description 单元测试
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest {

    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28885518425541/topics?scope=unanswered_questions&count=20");

        get.addHeader("cookie", "__cuid=5330a556392a4c5b8084b4cbc165e0f3; amp_fef1e8=930aec23-e22e-4f11-8864-0389bd5095d1R...1g55hl79m.1g55hl79t.1.1.2; UM_distinctid=183e61195d535b-0bddac94679c75-19525635-1aeaa0-183e61195d7c52; sensorsdata2015jssdkcross={\"distinct_id\":\"241858242255511\",\"first_id\":\"17ebd0b4317ecb-0b27f672c2d3af-133a6253-1296000-17ebd0b4318ba7\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"$device_id\":\"17ebd0b4317ecb-0b27f672c2d3af-133a6253-1296000-17ebd0b4318ba7\",\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTgwMmQ2YjZiOWIxZjMtMGQ4YzMzZjhmYTA3YmEtMzU3MzZhMDMtMTI5NjAwMC0xODAyZDZiNmI5YzEwODYiLCIkaWRlbnRpdHlfbG9naW5faWQiOiIyNDE4NTgyNDIyNTU1MTEifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"241858242255511\"}}; abtest_env=product; zsxqsessionid=8fae9a083a4874ab833c2158a44deb82; zsxq_access_token=5D862869-1229-A9B6-1BC1-C662EC4B16DD_D625BA7FD9CBBDFA");
        get.addHeader("Content-Type", "application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/412884248251548/answer");
        post.addHeader("cookie", "__cuid=5330a556392a4c5b8084b4cbc165e0f3; amp_fef1e8=930aec23-e22e-4f11-8864-0389bd5095d1R...1g55hl79m.1g55hl79t.1.1.2; UM_distinctid=183e61195d535b-0bddac94679c75-19525635-1aeaa0-183e61195d7c52; sensorsdata2015jssdkcross={\"distinct_id\":\"241858242255511\",\"first_id\":\"17ebd0b4317ecb-0b27f672c2d3af-133a6253-1296000-17ebd0b4318ba7\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"$device_id\":\"17ebd0b4317ecb-0b27f672c2d3af-133a6253-1296000-17ebd0b4318ba7\",\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTgwMmQ2YjZiOWIxZjMtMGQ4YzMzZjhmYTA3YmEtMzU3MzZhMDMtMTI5NjAwMC0xODAyZDZiNmI5YzEwODYiLCIkaWRlbnRpdHlfbG9naW5faWQiOiIyNDE4NTgyNDIyNTU1MTEifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"241858242255511\"}}; abtest_env=product; zsxqsessionid=8fae9a083a4874ab833c2158a44deb82; zsxq_access_token=5D862869-1229-A9B6-1BC1-C662EC4B16DD_D625BA7FD9CBBDFA");
        post.addHeader("Content-Type", "application/json;charset=utf8");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"自己去百度！\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": false\n" +
                "  }\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

}
