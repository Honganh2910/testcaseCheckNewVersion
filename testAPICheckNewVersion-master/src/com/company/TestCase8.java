package com.company;
import java.io.IOException;
public class TestCase8 {

        public void Unittest8() throws Exception {
            ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
            String token = resp.data1.token;
            String last_update = "9.0";

            ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI(last_update, token);
                if (((!res.code.equals("9995")))) throw new AssertionError();
                if ((!"User is not validated".equals(res.message)))throw new AssertionError();


            }
        }



