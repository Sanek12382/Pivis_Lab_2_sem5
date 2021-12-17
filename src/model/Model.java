package model;

public class Model {

    private MessageForum messageForum;
    private Order order;
    private Product product;
    private Review review;
    private UserAccount userAccount;
    private UserRole userRole;

    public void createMessageForum() { messageForum = new MessageForum();}

    public void createOrder() { order = new Order(); }

    public void createProduct() { product = new Product(); }

    public void createReview() { review = new Review(); }

    public void createUserAccount() { userAccount = new UserAccount(); }
}
