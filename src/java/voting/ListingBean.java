package voting;

public class ListingBean {
String name;
String Email;
String partyname;
String votecount;
 
    public ListingBean(String name, String Email, String partyname, String votecount) {
        this.name = name;
        this.Email = Email;
        this.partyname = partyname;
        this.votecount = votecount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPartyname() {
        return partyname;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }

    public String getVotecount() {
        return votecount;
    }

    public void setVotecount(String votecount) {
        this.votecount = votecount;
    }


}