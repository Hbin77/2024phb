package medistory.main;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SearchService {
    public SearchResult performSearch(String keyword) {
        // 로직 구현
        return new SearchResult(keyword, "검색 결과 예시");
    }
}