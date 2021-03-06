package Tests.config;
import org.aeonbits.owner.Config;

    @Config.LoadPolicy(Config.LoadType.MERGE)
    @Config.Sources({
            "system:properties",
            "classpath:config/remote.properties"
    })
    public interface WebConfig extends Config {
        @Key("web.remote.driver.user")
        String webRemoteDriverUser();

        @Key("web.remote.driver.password")
        String webRemoteDriverPassword();
    }

