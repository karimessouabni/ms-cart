package fr.cart;


import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartResources {




    @GetMapping("/hello-cart")
    String helloEureka(){
        return "hello from cart";
    }
}
