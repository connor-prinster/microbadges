package org.familysearch.spring.springbootmicrobadge.client;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.familysearch.spring.springbootmicrobadge.web.BaseComponent;
import org.familysearch.tf.jsonbind.dto.TfPerson;

import static org.assertj.core.api.Assertions.assertThat;

public class TfPersonClientTest extends BaseComponent {

  @Autowired
  TfPersonClient tfPersonClient;

  @Test
  public void testPersonClientReturnsCorrectly() {
    String personId = createDefaultPersonForTesting();
    TfPerson person = tfPersonClient.getPerson(personId);

    assertThat(person.getId())
        .as("Lets use RestTemplate to get the data back from TF")
        .isEqualTo(personId);
  }
}
