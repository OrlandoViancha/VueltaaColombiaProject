package com.uptc.frw.javaproject.Repositorio.logs;

import com.uptc.frw.javaproject.modelo.logs.OperacionLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OperacionLogRepository extends ElasticsearchRepository<OperacionLog, String> {
}
