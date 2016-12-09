package org.apache.flink.streaming.connectors.elasticsearch5;

import org.elasticsearch.action.ActionRequest;

import java.io.Serializable;

public interface RequestIndexer extends Serializable {
  void add(ActionRequest... actionRequests);
}