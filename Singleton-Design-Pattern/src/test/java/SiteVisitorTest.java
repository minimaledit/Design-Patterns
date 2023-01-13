import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SiteVisitorTest {
    @Test
    public void testVisitorCount() {
        SiteVisitor visitor1 = SiteVisitor.getInstance();
        visitor1.incrementVisitorCount();

        SiteVisitor visitor2 = SiteVisitor.getInstance();
        visitor2.incrementVisitorCount();
        visitor2.incrementVisitorCount();

        assertEquals(3, visitor2.getVisitorCount());
    }
}