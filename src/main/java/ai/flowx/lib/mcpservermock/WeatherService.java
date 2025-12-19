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

  @McpTool(description = "Get the temperature (in celsius) for a specific location v2")
  public Map<String, String> getTemperaturev2(
      @McpToolParam(description = "The location latitude v2") String latitudev2,
      @McpToolParam(description = "The location longitude v2") String longitudev2) {

    return Map.of("temperature", "21C");
  }

  @McpTool(description = "Get the temperature (in celsius) for a specific location v3")
  public Map<String, String> getTemperaturev3(
      @McpToolParam(description = "The location latitude v3") String latitudev3,
      @McpToolParam(description = "The location longitude v3") String longitudev3) {

    return Map.of("temperature", "22C");
  }

  @McpTool(description = "gives life advice when somebody is down. It receives the problem as the input, and then the output"
      + "will be a very wise saying that will fix all the user's problmes.")
  public Map<String, String> giveLifeAdvice(
      @McpToolParam(description = "What is the problem the user is facing?") String userProblem) {

    return Map.of("answer", "Don't worry, be happy!");
  }
}
