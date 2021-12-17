package controller;

import model.Model;

public class Controller {
    public Controller(Model model) {}

    private AccountController accountController;
    private BuyerController buyerController;
    private CatalogController catalogController;
    private DatabaseManagerController databaseManagerController;
    private ForumController forumController;
    private ProductController productController;
    private RegistrationController registrationController;
    private SellerController sellerController;
    private MainWindowController mainWindowController;

    public void createAccountController() {}
    public void createBuyerController() {}
    public void createCatalogController() {}
    public void createDatabaseManagerController() {}
    public void createForumController() {}
    public void createProductController() {}
    public void createRegistrationController() {}
    public void createSellerController() {}
    public void createMainWindowController() {}

    public AccountController getAccountController() {
        return accountController;
    }

    public BuyerController getBuyerController() {
        return buyerController;
    }

    public CatalogController getCatalogController() {
        return catalogController;
    }

    public DatabaseManagerController getDatabaseManagerController() {
        return databaseManagerController;
    }

    public ForumController getForumController() {
        return forumController;
    }

    public ProductController getProductController() {
        return productController;
    }

    public RegistrationController getRegistrationController() {
        return registrationController;
    }

    public SellerController getSellerController() {
        return sellerController;
    }

    public MainWindowController getMainWindowController() {
        return mainWindowController;
    }
}
