import com.ncsu.search.enums.SearchType;
import com.ncsu.search.exceptions.CustomException;
import com.ncsu.search.factories.SearchStrategyFactory;
import com.ncsu.search.handler.InputHandler;
import com.ncsu.search.handler.SearchHandler;
import com.ncsu.search.model.Graph;

public class SearchRomania {

    public static void main(String[] args) throws CustomException {
        InputHandler.handleInput(args);

        Graph.initialize();

        SearchHandler searchHandler = SearchStrategyFactory.getHandlerFor(SearchType.valueOf(args[0]));
        searchHandler.search(args[1], args[2]);

    }
}
