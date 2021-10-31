package stringmethods.url;

public class UrlManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;
    private String url;

    public UrlManager(String url){
        this.url = url;
        this.host = getUrlHost(url);
        this.path = getUrlPath(url);
        this.port = Integer.parseInt(getUrlPort(url));
        this.query = getUrlQuerry(url);
        this.protocol = getUrlProtocol(url);
    }

    private String getUrlProtocol(String url){
        return url.trim().substring(0,url.indexOf(":"));
    }
    private String getUrlHost(String url){
        String temp = url.substring((url.indexOf("//") + 2), url.length());
        return temp.substring(0, temp.indexOf("/"));
    }
    private String getUrlPort(String url){
        String temp = url.substring((url.indexOf("//") + 2), url.length());
        temp = temp.substring(0, temp.indexOf("/"));
        if (temp.contains(":")){
            String result = temp.substring(temp.indexOf(":")+1, temp.length());
            return result + "";
        }else{
            return "";
        }
    }
    private String getUrlPath(String url){
        String temp = url.substring((url.indexOf("//") + 2), url.length());
        temp = temp.substring(temp.indexOf("/"));
        return temp.substring(1, temp.indexOf("?"));
    }
    private String getUrlQuerry(String url) {
        String temp = url.substring((url.indexOf("//") + 2), url.length());
        temp = temp.substring(temp.indexOf("/"));
        return temp.substring(temp.indexOf("?")+1, temp.length());
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getUrl() {
        return url;
    }

    public static void main(String[] args) {
        String testUrl = "https://earthquake.usgs.gov:1000/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(testUrl);
        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPort());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getQuery());
    }
}
