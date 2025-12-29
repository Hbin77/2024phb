package medistory.main;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/search")
public class SearchController {

    @GetMapping("/{keyword}")
    public SearchResult search(@PathVariable String keyword) {
        // 로직 구현
        return new SearchResult(keyword, "검색 결과 예시");
    }
}