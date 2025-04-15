package com.beer_service.web.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@NoArgsConstructor
@Data
public class BeerDto {
    @Null
    private UUID id;
    @Null
    private Integer version;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ",shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;

    @Null
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ",shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyleEnum;

    @NotNull
    @Positive
    private Long upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull
    @Positive
    private BigDecimal price;
    private Integer quantityOnHand;

    public BeerDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate, String beerName, BeerStyleEnum beerStyleEnum, Long upc, BigDecimal price, Integer quantityOnHand) {
        this.id = id;
        this.version = version;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.beerName = beerName;
        this.beerStyleEnum = beerStyleEnum;
        this.upc = upc;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public static BeerDtoBuilder builder() {
        return new BeerDtoBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public OffsetDateTime getCreatedDate() {
        return this.createdDate;
    }

    public OffsetDateTime getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getBeerName() {
        return this.beerName;
    }

    public BeerStyleEnum getBeerStyleEnum() {
        return this.beerStyleEnum;
    }

    public Long getUpc() {
        return this.upc;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public void setBeerStyleEnum(BeerStyleEnum beerStyleEnum) {
        this.beerStyleEnum = beerStyleEnum;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BeerDto)) return false;
        final BeerDto other = (BeerDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate))
            return false;
        final Object this$lastModifiedDate = this.getLastModifiedDate();
        final Object other$lastModifiedDate = other.getLastModifiedDate();
        if (this$lastModifiedDate == null ? other$lastModifiedDate != null : !this$lastModifiedDate.equals(other$lastModifiedDate))
            return false;
        final Object this$beerName = this.getBeerName();
        final Object other$beerName = other.getBeerName();
        if (this$beerName == null ? other$beerName != null : !this$beerName.equals(other$beerName)) return false;
        final Object this$beerStyleEnum = this.getBeerStyleEnum();
        final Object other$beerStyleEnum = other.getBeerStyleEnum();
        if (this$beerStyleEnum == null ? other$beerStyleEnum != null : !this$beerStyleEnum.equals(other$beerStyleEnum))
            return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$quantityOnHand = this.getQuantityOnHand();
        final Object other$quantityOnHand = other.getQuantityOnHand();
        if (this$quantityOnHand == null ? other$quantityOnHand != null : !this$quantityOnHand.equals(other$quantityOnHand))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BeerDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $createdDate = this.getCreatedDate();
        result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
        final Object $lastModifiedDate = this.getLastModifiedDate();
        result = result * PRIME + ($lastModifiedDate == null ? 43 : $lastModifiedDate.hashCode());
        final Object $beerName = this.getBeerName();
        result = result * PRIME + ($beerName == null ? 43 : $beerName.hashCode());
        final Object $beerStyleEnum = this.getBeerStyleEnum();
        result = result * PRIME + ($beerStyleEnum == null ? 43 : $beerStyleEnum.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $quantityOnHand = this.getQuantityOnHand();
        result = result * PRIME + ($quantityOnHand == null ? 43 : $quantityOnHand.hashCode());
        return result;
    }

    public String toString() {
        return "BeerDto(id=" + this.getId() + ", version=" + this.getVersion() + ", createdDate=" + this.getCreatedDate() + ", lastModifiedDate=" + this.getLastModifiedDate() + ", beerName=" + this.getBeerName() + ", beerStyleEnum=" + this.getBeerStyleEnum() + ", upc=" + this.getUpc() + ", price=" + this.getPrice() + ", quantityOnHand=" + this.getQuantityOnHand() + ")";
    }

    public static class BeerDtoBuilder {
        private UUID id;
        private Integer version;
        private OffsetDateTime createdDate;
        private OffsetDateTime lastModifiedDate;
        private String beerName;
        private BeerStyleEnum beerStyleEnum;
        private Long upc;
        private BigDecimal price;
        private Integer quantityOnHand;

        BeerDtoBuilder() {
        }

        public BeerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerDtoBuilder version(Integer version) {
            this.version = version;
            return this;
        }

        public BeerDtoBuilder createdDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public BeerDtoBuilder lastModifiedDate(OffsetDateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public BeerDtoBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerDtoBuilder beerStyleEnum(BeerStyleEnum beerStyleEnum) {
            this.beerStyleEnum = beerStyleEnum;
            return this;
        }

        public BeerDtoBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public BeerDtoBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public BeerDtoBuilder quantityOnHand(Integer quantityOnHand) {
            this.quantityOnHand = quantityOnHand;
            return this;
        }

        public BeerDto build() {
            return new BeerDto(this.id, this.version, this.createdDate, this.lastModifiedDate, this.beerName, this.beerStyleEnum, this.upc, this.price, this.quantityOnHand);
        }

        public String toString() {
            return "BeerDto.BeerDtoBuilder(id=" + this.id + ", version=" + this.version + ", createdDate=" + this.createdDate + ", lastModifiedDate=" + this.lastModifiedDate + ", beerName=" + this.beerName + ", beerStyleEnum=" + this.beerStyleEnum + ", upc=" + this.upc + ", price=" + this.price + ", quantityOnHand=" + this.quantityOnHand + ")";
        }
    }
}
