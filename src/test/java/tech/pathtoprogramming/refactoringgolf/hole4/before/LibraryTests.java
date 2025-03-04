package tech.pathtoprogramming.refactoringgolf.hole4.before;

import org.junit.jupiter.api.Test;
import tech.pathtoprogramming.refactoringgolf.hole4.before.Library;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTests {

    @Test
    public void donatedTitlesAreAddedToLibraryWithOneDefaultCopy() {
        Library library = new Library();
        String titleName = "Jaws 3D";
        String donorId = "Jason123";
        library.donate(titleName, donorId );
        Object[] donatedTitle = library.getTitles().get(titleName);
        assertEquals(titleName, (String) donatedTitle[0]);
        assertEquals(donorId, (String)donatedTitle[1]);
        assertEquals(1, (int)donatedTitle[2]);
        assertEquals(1, library.getTitlesDonatedByMember(donorId).size());
    }

}
