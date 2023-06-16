package tu.asesoria.financiera;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class ControladorPublicaciones {
    @GetMapping
    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        // Agregue su lógica para recuperar publicaciones de blog desde una base de datos u otra fuente
        return posts;
    }
}
