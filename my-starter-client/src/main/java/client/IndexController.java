package client;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @RequestMapping({ "/", "" })
    public String index() {
        return "index";
    }

}

@RequestMapping(value = "/books-list", method = RequestMethod.GET)
public String booksList(Model model) {
    List<Book> books = new ArrayList<>();
books.add(new Book("my first book", "1234523523"));
model.addAttribute("books", books);
return "index";
}

     @RequestMapping(value = "/add-book", method = RequestMethod.POST)
     public String addNewBook(
     ) {
     return "redirect:/books-list";
     }
}

@Getter
@Setter
@AllArgsConstructor
class Book {
    private String title;
    private String isbn;
}