package si.elixir.vlabs.docker.Logging;

import com.kumuluz.ee.common.config.EeConfig;
import com.kumuluz.ee.logs.cdi.Log;
import org.apache.logging.log4j.CloseableThreadContext;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.HashMap;
import java.util.UUID;

@Log
@Interceptor
@Priority(Interceptor.Priority.PLATFORM_BEFORE)
public class LogInterceptor {

    @AroundInvoke
    public Object logMethodEntry(InvocationContext context) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("unique_request_id", UUID.randomUUID().toString());
        params.put("service_name", EeConfig.getInstance().getName());
        params.put("service_version", EeConfig.getInstance().getVersion());
        params.put("server_base_url", EeConfig.getInstance().getServer().getBaseUrl());

        try (final CloseableThreadContext.Instance ctc = CloseableThreadContext.putAll(params)) {
            return context.proceed();
        }
    }
}
