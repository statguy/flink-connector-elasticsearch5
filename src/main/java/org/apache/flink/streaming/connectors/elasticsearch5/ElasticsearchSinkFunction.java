package org.apache.flink.streaming.connectors.elasticsearch5;

import org.apache.flink.api.common.functions.Function;
import org.apache.flink.api.common.functions.RuntimeContext;

import java.io.Serializable;

/**
 * Method that creates an {@link org.elasticsearch.action.ActionRequest} from an element in a Stream.
 *
 * <p>
 * This is used by {@link ElasticsearchSink} to prepare elements for sending them to Elasticsearch.
 *
 * <p>
 * Example:
 *
 * <pre>{@code
 *					private static class TestElasticSearchSinkFunction implements
 *						ElasticsearchSinkFunction<Tuple2<Integer, String>> {
 *
 *					public IndexRequest createIndexRequest(Tuple2<Integer, String> element) {
 *						Map<String, Object> json = new HashMap<>();
 *						json.put("data", element.f1);
 *
 *						return Requests.indexRequest()
 *							.index("my-index")
 *							.type("my-type")
 *							.id(element.f0.toString())
 *							.source(json);
 *						}
 *
 *				public void process(Tuple2<Integer, String> element, RuntimeContext ctx, RequestIndexer indexer) {
 *					indexer.add(createIndexRequest(element));
 *				}
 *		}
 *
 * }</pre>
 *
 * @param <T> The type of the element handled by this {@code ElasticsearchSinkFunction}
 */
public interface ElasticsearchSinkFunction<T> extends Serializable, Function {
  void process(T element, RuntimeContext ctx, RequestIndexer indexer);
}
