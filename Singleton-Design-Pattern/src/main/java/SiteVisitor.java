public class SiteVisitor {
    private static SiteVisitor instance = null;
    private int visitorCount;

    private SiteVisitor() {
        visitorCount = 0;
    }

    public static SiteVisitor getInstance() {
        if (instance == null) {
            instance = new SiteVisitor();
        }
        return instance;
    }

    public void incrementVisitorCount() {
        visitorCount++;
    }

    public int getVisitorCount() {
        return visitorCount;
    }
}