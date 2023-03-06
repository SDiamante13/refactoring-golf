package tech.pathtoprogramming.refactoringgolf.hole4.after;

public class Member {

    protected final String membershipId;

    public Member(String id) {
        membershipId = id;
    }

    public String getId() {
        return membershipId;
    }

}
