package ai.flowx.lib.mcpservermock;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
public class WeatherService {

    @McpTool(description = "Get the temperature (in celsius) for a specific location")
    public Map<String, String> getTemperature(
            @McpToolParam(description = "The location latitude") String latitude,
            @McpToolParam(description = "The location longitude") String longitude) {

       return Map.of("temperature", "20C");
    }

    @McpTool(description = "New tool baby with new name v2")
    public Map<String, String> getNewToolBaby(
            @McpToolParam(description = "This is different") String diff) {

        return Map.of("all love", diff);
    }

    @McpTool(description = "Top of the line tools 2026")
    public Map<String, String> bestTool2026(
            @McpToolParam(description = "This is tool is best of the best") String top) {

        return Map.of("no contest", top);
    }

    @McpTool(description = "Top of the line tools 2027 reloaded")
    public Map<String, String> bestTool2027(
            @McpToolParam(description = "This is tool is best of the best of the best") String top) {

        return Map.of("no contest 2027", top);
    }

  @McpTool(description = "gives life advice when somebody is down. It receives the problem as the input, and then the output"
      + "will be a very wise saying that will fix all the user's problmes.")
  public Map<String, String> giveLifeAdvice(
      @McpToolParam(description = "What is the problem the user is facing?") String userProblem) {

    return Map.of("answer", "Don't worry, be happy!");
  }

//    @McpTool(description = "New tool baby v2")
//    public Map<String, String> getNewToolBabyv2(
//            @McpToolParam(description = "Some sugar v2") String love) {
//
//        return Map.of("all love v2", love);
//    }
}
