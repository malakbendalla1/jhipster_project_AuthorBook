package com.mycompany.myapp.service.dto;

import java.time.LocalDate;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.Book} entity.
 */
public class BookDTO implements Serializable {
    
    private Long id;

    private String title;

    private String description;

    private LocalDate publicationDate;

    private BigDecimal price;


    private Long ecritParId;

    private String ecritParName;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getEcritParId() {
        return ecritParId;
    }

    public void setEcritParId(Long authorId) {
        this.ecritParId = authorId;
    }

    public String getEcritParName() {
        return ecritParName;
    }

    public void setEcritParName(String authorName) {
        this.ecritParName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BookDTO)) {
            return false;
        }

        return id != null && id.equals(((BookDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", publicationDate='" + getPublicationDate() + "'" +
            ", price=" + getPrice() +
            ", ecritParId=" + getEcritParId() +
            ", ecritParName='" + getEcritParName() + "'" +
            "}";
    }
}
