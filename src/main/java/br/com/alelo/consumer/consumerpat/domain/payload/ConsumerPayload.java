package br.com.alelo.consumer.consumerpat.domain.payload;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import br.com.alelo.consumer.consumerpat.domain.dto.AddressDTO;
import br.com.alelo.consumer.consumerpat.domain.dto.ContactDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ConsumerPayload {
	
	@ApiModelProperty(value = "Consumer's name", example = "José das Couves")
    private String name;
	@ApiModelProperty(value = "Consumer's identification document number (CPF/Passport)", example = "72542961026")
    private String documentNumber;
	@ApiModelProperty(value = "Consumer's birth date using format yyyy-MM-dd", example = "1980-01-01")
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    private ContactDTO contact;
    private AddressDTO address;
    private Set<CardPayload> cards;

}
