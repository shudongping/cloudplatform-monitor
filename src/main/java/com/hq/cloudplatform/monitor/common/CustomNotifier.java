package com.hq.cloudplatform.monitor.common;

import de.codecentric.boot.admin.event.ClientApplicationEvent;
import de.codecentric.boot.admin.notify.AbstractStatusChangeNotifier;
import org.springframework.stereotype.Component;

/**
 * @Author shudongping
 * @Date 2018/9/30
 */

@Component
public class CustomNotifier extends AbstractStatusChangeNotifier {


    @Override
    protected void doNotify(ClientApplicationEvent clientApplicationEvent) throws Exception {



    }
}
