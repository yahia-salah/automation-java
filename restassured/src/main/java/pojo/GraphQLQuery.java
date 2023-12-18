package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class GraphQLQuery {
    private String query;
    private Object variables;
}
