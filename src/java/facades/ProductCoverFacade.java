
//package facades;
//
//import enitys.ProductCover;
//import enitys.Product;
//import enitys.ProductCover;
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//public class ProductCoverFacade extends AbstractFacade<ProductCover>{
//    @PersistenceContext(unitName = "JPTV20_webBootsShopPU")
//    private EntityManager em;
//
//    @Override
//    protected EntityManager getEntityManager() {
//        return em;
//    }
//
//    public ProductCoverFacade() {
//        super(ProductCover.class);
//    }
//
//    public ProductCover findCoverByProduct(Product product) {
//        try {
//            return (ProductCover) em.createQuery("SELECT bc FROM BookCover bc WHERE bc.product=:product")
//                    .setParameter("product", product)
//                    .getSingleResult();
//        } catch (Exception e) {
//            return new ProductCover();
//        }
//    }
//}
