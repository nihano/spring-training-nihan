package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name="payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

    //@OneToOne (cascade = CascadeType.ALL)//instead of creatıng a repo for paymentDetail and save it in DB first we use cascade and wıll ALL whatever we do for payment wıll happen for paymentDetail obj as well in this caseç
    @OneToOne (cascade ={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="payment_detail_id") //to change the column name (this name is default anyway)
    private PaymentDetail paymentDetail;

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
