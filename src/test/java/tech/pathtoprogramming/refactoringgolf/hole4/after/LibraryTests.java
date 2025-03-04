package tech.pathtoprogramming.refactoringgolf.hole4.after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTests {

    @Test
    public void donatedTitlesAreAddedToLibraryWithOneDefaultCopy() {
        Library library = new Library();
        String titleName = "Jaws 3D";
        String donorId = "Jason123";
        Member donor = new Member(donorId);
        Title title = new Title(titleName, donor);
        library.donate(title );
        title = library.getTitles().get(titleName);
        assertEquals(titleName, title.getTitleName());
        assertEquals(donorId, title.getDonorId());
        assertEquals(1, title.getCopyCount());
        assertEquals(1, library.getTitlesDonatedByMember(donorId).size());
    }
}
