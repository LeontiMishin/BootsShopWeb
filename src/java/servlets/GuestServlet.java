
package servlets;

import enitys.Cover;
import enitys.Product;
import enitys.ProductCover;
import enitys.User;
//import facades.ProductCoverFacade;
import facades.ProductFacade;
import facades.UserRolesFacade;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "GuestServlet", urlPatterns = {
    "/listProducts"
})
public class GuestServlet extends HttpServlet {
    @EJB private ProductFacade productFacade;
    @EJB private UserRolesFacade userRolesFacade;
//    @EJB private ProductCoverFacade ProductCoverFacade;
//    @EJB private ProductFacade ProductFacade;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        HttpSession session = request.getSession(false);
        User authUser = (User) session.getAttribute("authUser");
        session.setAttribute("topRole", userRolesFacade.getTopRole(authUser));
        
        String path = request.getServletPath();
        switch(path) {
            case "/listProducts":
                List<Product> products = productFacade.findAll();
                request.setAttribute("products", products);
                Map<Product,Cover> mapProducts = new HashMap<>();
//                for(Product b : products){
//                    ProductCover productCover = ProductCoverFacade.findCoverByProduct(b);
//                    mapProducts.put(b, productCover.getCover());
//                }
                request.setAttribute("mapProducts", mapProducts);
                request.setAttribute("activeListProducts", true);
                request.getRequestDispatcher("/WEB-INF/listProducts.jsp").forward(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
