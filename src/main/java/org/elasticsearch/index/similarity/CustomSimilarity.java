package org.elasticsearch.index.similarity;

import org.apache.lucene.search.similarities.ClassicSimilarity;

@SuppressWarnings("serial")
public class CustomSimilarity extends ClassicSimilarity {
	public CustomSimilarity() {
    }

    @Override
    public float idf(long docFreq, long numDocs){
        return 1.0f;
    }
}
