package com.altamiracorp.lumify.web.routes.graph;

import com.altamiracorp.lumify.web.routes.RouteTestBase;
import com.altamiracorp.securegraph.Graph;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TitanQueryFormatterTest extends RouteTestBase {
    // TODO rewrite this test for secure graph!!!
    private Graph graph;

    @Override
    @Before
    public void setUp() throws Exception {
//        super.setUp();
//
//        graph = new TinkerGraph();
//        Vertex person1 = graph.addVertex("1");
//        person1.setProperty(PropertyName.TITLE.toString(), "person1");
//        person1.setProperty("birthDate", OntologyProperty.DATE_FORMAT.parse("1978-10-30").getTime());
//        person1.setProperty("alias", "Joe");
//        person1.setProperty("income", 500.12);
//
//        Vertex person2 = graph.addVertex("2");
//        person2.setProperty(PropertyName.TITLE.toString(), "person2");
//        person2.setProperty("birthDate", OntologyProperty.DATE_FORMAT.parse("1977-01-30").getTime());
//        person2.setProperty("alias", "Bob Smith");
//        person2.setProperty("income", 300.5);
    }

    @Test
    public void testFilter_date_isBefore() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "birthDate",
//                        "propertyDataType", "date",
//                        "predicate", "<",
//                        "values", new JSONArray("['1977-10-30']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person2");
   }
//
//    @Test
//    public void testFilter_date_isBeforeEquals() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "birthDate",
//                        "propertyDataType", "date",
//                        "predicate", "<=",
//                        "values", new JSONArray("['1977-01-30']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person2");
//    }
//
//    @Test
//    public void testFilter_date_isAfter() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "birthDate",
//                        "propertyDataType", "date",
//                        "predicate", ">",
//                        "values", new JSONArray("['1977-10-30']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person1");
//    }
//
//    @Test
//    public void testFilter_date_isAfterEqual() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "birthDate",
//                        "propertyDataType", "date",
//                        "predicate", ">=",
//                        "values", new JSONArray("['1978-10-30']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person1");
//    }
//
//    @Test
//    public void testFilter_date_isEqual() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "birthDate",
//                        "propertyDataType", "date",
//                        "predicate", "equal",
//                        "values", new JSONArray("['1977-01-30']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person2");
//    }
//
//    @Test
//    public void testFilter_date_range() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "birthDate",
//                        "propertyDataType", "date",
//                        "predicate", "range",
//                        "values", new JSONArray("['1977-01-28', '1977-02-15']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person2");
//    }
//
//    @Test
//    public void testFilter_string_contains() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "alias",
//                        "propertyDataType", "string",
//                        "values", new JSONArray("['bob']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person2");
//    }
//
//    @Test
//    public void testFilter_number_lessThan() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "income",
//                        "propertyDataType", "currency",
//                        "predicate", "<",
//                        "values", new JSONArray("[400]"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person2");
//    }
//
//    @Test
//    public void testFilter_number_greaterThan() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "income",
//                        "propertyDataType", "currency",
//                        "predicate", ">",
//                        "values", new JSONArray("['400']"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person1");
//    }
//
//    @Test
//    public void testFilter_number_isEqual() throws Exception {
//        JSONArray filterJson =
//                createFilterArray(
//                        "propertyName", "income",
//                        "propertyDataType", "currency",
//                        "predicate", "equal",
//                        "values", new JSONArray("[300.5]"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertEquals(1, filteredVertices.size());
//        assertEquals("person2", filteredVertices.get(0).getProperty(PropertyName.TITLE));
//    }
//
//    @Test
//    public void testFilter_number_range() throws Exception {
//        JSONArray filterJson = createFilterArray(
//                "propertyName", "income",
//                "propertyDataType", "currency",
//                "predicate", "range",
//                "values", new JSONArray("[400, 600]"));
//        List<GraphVertex> filteredVertices = runFilter(filterJson);
//        assertFilteredCorrectly(filteredVertices, "person1");
//    }
//
//    private void assertFilteredCorrectly(List<GraphVertex> filteredVertices, String expectedName) {
//        assertEquals(1, filteredVertices.size());
//        assertEquals(expectedName, filteredVertices.get(0).getProperty(PropertyName.TITLE));
//    }
//
//    private List<GraphVertex> runFilter(JSONArray filterJson) throws JSONException {
//        TitanQueryFormatter formatter = new TitanQueryFormatter();
//        GremlinPipeline<Vertex, Vertex> queryPipeline = formatter.createQueryPipeline(graph.getVertices(), filterJson);
//        List<GraphVertex> vertices = Lists.newArrayList();
//        for (Vertex vertex : queryPipeline) {
//            vertices.add(new TitanGraphVertex(vertex));
//        }
//
//        return vertices;
//    }
//
//    private JSONArray createFilterArray(Object... keyValues) throws JSONException {
//        JSONArray filterJson = new JSONArray();
//        JSONObject propertyFilter = new JSONObject();
//        addFilterProps(propertyFilter, keyValues);
//        filterJson.put(propertyFilter);
//        return filterJson;
//    }
//
//    private void addFilterProps(JSONObject filter, Object... keyValues) throws JSONException {
//        if (keyValues.length % 2 != 0) {
//            throw new IllegalArgumentException("key values must be even");
//        }
//
//        for (int i = 0; i < keyValues.length; i += 2) {
//            filter.put((String) keyValues[i], keyValues[i + 1]);
//        }
//    }
}
