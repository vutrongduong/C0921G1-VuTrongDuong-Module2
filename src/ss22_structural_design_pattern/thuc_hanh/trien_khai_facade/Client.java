package ss22_structural_design_pattern.thuc_hanh.trien_khai_facade;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }

    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
