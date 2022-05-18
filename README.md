# wpRestApiWrapper

woocomerce rest api for springBoot applications

initialization:

        WpRestApiConfig wpRestApiConfig = WpRestApiConfigBuilder
                .setSiteUrl("server url")
                .setConsumerKey("consumerKey")
                .setConsumerSecret("consumerSecret")
                .serVersion(EnumWpApiVersion.v3)
                .useHttps(true)//optional
                .build();
        wpRestApi.init( wpRestApiConfig);
        
use:

        SystemStatus systemStatus = wpRestApi.system.getSystemStatus();
        or
        Product[] products = wpRestApi.product.getAll("page_number","item_per_page");
        

//todo
add first version maven dependency 
