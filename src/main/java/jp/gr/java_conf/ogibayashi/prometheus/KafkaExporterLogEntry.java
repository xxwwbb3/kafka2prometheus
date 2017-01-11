package jp.gr.java_conf.ogibayashi.prometheus;

import java.util.Map;
import lombok.Data;
import lombok.NonNull;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@EqualsAndHashCode(exclude={"value"})
public class KafkaExporterLogEntry {
    @NonNull private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	public Map<String, String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}
	@NonNull private long value;
    private Map<String,String> labels;
}
