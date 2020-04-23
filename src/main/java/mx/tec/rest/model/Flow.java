package mx.tec.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Flow")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flow {
    @XmlElement
    private int total_fpackets;
    @XmlElement
    private int total_fvolume;
    @XmlElement
    private int total_bpackets;
    @XmlElement
    private int total_bvolume;
    @XmlElement
    private int min_fpktl;
    @XmlElement
    private int mean_fpktl;
    @XmlElement
    private int max_fpktl;
    @XmlElement
    private int std_fpktl;
    @XmlElement
    private int min_bpktl;
    @XmlElement
    private int mean_bpktl;
    @XmlElement
    private int max_bpktl;
    @XmlElement
    private int std_bpktl;
    @XmlElement
    private int min_fiat;
    @XmlElement
    private int mean_fiat;
    @XmlElement
    private int max_fiat;
    @XmlElement
    private int std_fiat;
    @XmlElement
    private int min_biat;
    @XmlElement
    private int mean_biat;
    @XmlElement
    private int max_biat;
    @XmlElement
    private int std_biat;
    @XmlElement
    private int duration;
    @XmlElement
    private int min_active;
    @XmlElement
    private int mean_active;
    @XmlElement
    private int max_active;
    @XmlElement
    private int std_active;
    @XmlElement
    private int min_idle;
    @XmlElement
    private int mean_idle;
    @XmlElement
    private int max_idle;
    @XmlElement
    private int std_idle;
    @XmlElement
    private int sflow_fpackets;
    @XmlElement
    private int sflow_fbytes;
    @XmlElement
    private int sflow_bpackets;
    @XmlElement
    private int sflow_bbytes;
    @XmlElement
    private int fpsh_cnt;
    @XmlElement
    private int bpsh_cnt;
    @XmlElement
    private int furg_cnt;
    @XmlElement
    private int burg_cnt;
    @XmlElement
    private int total_fhlen;
    @XmlElement
    private int total_bhlen;

    public Flow() { }

    public Flow(int total_fpackets, int total_fvolume, int total_bpackets, int total_bvolume, int min_fpktl, int mean_fpktl, int max_fpktl, int std_fpktl, int min_bpktl, int mean_bpktl, int max_bpktl, int std_bpktl, int min_fiat, int mean_fiat, int max_fiat, int std_fiat, int min_biat, int mean_biat, int max_biat, int std_biat, int duration, int min_active, int mean_active, int max_active, int std_active, int min_idle, int mean_idle, int max_idle, int std_idle, int sflow_fpackets, int sflow_fbytes, int sflow_bpackets, int sflow_bbytes, int fpsh_cnt, int bpsh_cnt, int furg_cnt, int burg_cnt, int total_fhlen, int total_bhlen) {
        this.total_fpackets = total_fpackets;
        this.total_fvolume = total_fvolume;
        this.total_bpackets = total_bpackets;
        this.total_bvolume = total_bvolume;
        this.min_fpktl = min_fpktl;
        this.mean_fpktl = mean_fpktl;
        this.max_fpktl = max_fpktl;
        this.std_fpktl = std_fpktl;
        this.min_bpktl = min_bpktl;
        this.mean_bpktl = mean_bpktl;
        this.max_bpktl = max_bpktl;
        this.std_bpktl = std_bpktl;
        this.min_fiat = min_fiat;
        this.mean_fiat = mean_fiat;
        this.max_fiat = max_fiat;
        this.std_fiat = std_fiat;
        this.min_biat = min_biat;
        this.mean_biat = mean_biat;
        this.max_biat = max_biat;
        this.std_biat = std_biat;
        this.duration = duration;
        this.min_active = min_active;
        this.mean_active = mean_active;
        this.max_active = max_active;
        this.std_active = std_active;
        this.min_idle = min_idle;
        this.mean_idle = mean_idle;
        this.max_idle = max_idle;
        this.std_idle = std_idle;
        this.sflow_fpackets = sflow_fpackets;
        this.sflow_fbytes = sflow_fbytes;
        this.sflow_bpackets = sflow_bpackets;
        this.sflow_bbytes = sflow_bbytes;
        this.fpsh_cnt = fpsh_cnt;
        this.bpsh_cnt = bpsh_cnt;
        this.furg_cnt = furg_cnt;
        this.burg_cnt = burg_cnt;
        this.total_fhlen = total_fhlen;
        this.total_bhlen = total_bhlen;
    }

    public int getTotal_fpackets() {
        return total_fpackets;
    }

    public void setTotal_fpackets(int total_fpackets) {
        this.total_fpackets = total_fpackets;
    }

    public int getTotal_fvolume() {
        return total_fvolume;
    }

    public void setTotal_fvolume(int total_fvolume) {
        this.total_fvolume = total_fvolume;
    }

    public int getTotal_bpackets() {
        return total_bpackets;
    }

    public void setTotal_bpackets(int total_bpackets) {
        this.total_bpackets = total_bpackets;
    }

    public int getTotal_bvolume() {
        return total_bvolume;
    }

    public void setTotal_bvolume(int total_bvolume) {
        this.total_bvolume = total_bvolume;
    }

    public int getMin_fpktl() {
        return min_fpktl;
    }

    public void setMin_fpktl(int min_fpktl) {
        this.min_fpktl = min_fpktl;
    }

    public int getMean_fpktl() {
        return mean_fpktl;
    }

    public void setMean_fpktl(int mean_fpktl) {
        this.mean_fpktl = mean_fpktl;
    }

    public int getMax_fpktl() {
        return max_fpktl;
    }

    public void setMax_fpktl(int max_fpktl) {
        this.max_fpktl = max_fpktl;
    }

    public int getStd_fpktl() {
        return std_fpktl;
    }

    public void setStd_fpktl(int std_fpktl) {
        this.std_fpktl = std_fpktl;
    }

    public int getMin_bpktl() {
        return min_bpktl;
    }

    public void setMin_bpktl(int min_bpktl) {
        this.min_bpktl = min_bpktl;
    }

    public int getMean_bpktl() {
        return mean_bpktl;
    }

    public void setMean_bpktl(int mean_bpktl) {
        this.mean_bpktl = mean_bpktl;
    }

    public int getMax_bpktl() {
        return max_bpktl;
    }

    public void setMax_bpktl(int max_bpktl) {
        this.max_bpktl = max_bpktl;
    }

    public int getStd_bpktl() {
        return std_bpktl;
    }

    public void setStd_bpktl(int std_bpktl) {
        this.std_bpktl = std_bpktl;
    }

    public int getMin_fiat() {
        return min_fiat;
    }

    public void setMin_fiat(int min_fiat) {
        this.min_fiat = min_fiat;
    }

    public int getMean_fiat() {
        return mean_fiat;
    }

    public void setMean_fiat(int mean_fiat) {
        this.mean_fiat = mean_fiat;
    }

    public int getMax_fiat() {
        return max_fiat;
    }

    public void setMax_fiat(int max_fiat) {
        this.max_fiat = max_fiat;
    }

    public int getStd_fiat() {
        return std_fiat;
    }

    public void setStd_fiat(int std_fiat) {
        this.std_fiat = std_fiat;
    }

    public int getMin_biat() {
        return min_biat;
    }

    public void setMin_biat(int min_biat) {
        this.min_biat = min_biat;
    }

    public int getMean_biat() {
        return mean_biat;
    }

    public void setMean_biat(int mean_biat) {
        this.mean_biat = mean_biat;
    }

    public int getMax_biat() {
        return max_biat;
    }

    public void setMax_biat(int max_biat) {
        this.max_biat = max_biat;
    }

    public int getStd_biat() {
        return std_biat;
    }

    public void setStd_biat(int std_biat) {
        this.std_biat = std_biat;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMin_active() {
        return min_active;
    }

    public void setMin_active(int min_active) {
        this.min_active = min_active;
    }

    public int getMean_active() {
        return mean_active;
    }

    public void setMean_active(int mean_active) {
        this.mean_active = mean_active;
    }

    public int getMax_active() {
        return max_active;
    }

    public void setMax_active(int max_active) {
        this.max_active = max_active;
    }

    public int getStd_active() {
        return std_active;
    }

    public void setStd_active(int std_active) {
        this.std_active = std_active;
    }

    public int getMin_idle() {
        return min_idle;
    }

    public void setMin_idle(int min_idle) {
        this.min_idle = min_idle;
    }

    public int getMean_idle() {
        return mean_idle;
    }

    public void setMean_idle(int mean_idle) {
        this.mean_idle = mean_idle;
    }

    public int getMax_idle() {
        return max_idle;
    }

    public void setMax_idle(int max_idle) {
        this.max_idle = max_idle;
    }

    public int getStd_idle() {
        return std_idle;
    }

    public void setStd_idle(int std_idle) {
        this.std_idle = std_idle;
    }

    public int getSflow_fpackets() {
        return sflow_fpackets;
    }

    public void setSflow_fpackets(int sflow_fpackets) {
        this.sflow_fpackets = sflow_fpackets;
    }

    public int getSflow_fbytes() {
        return sflow_fbytes;
    }

    public void setSflow_fbytes(int sflow_fbytes) {
        this.sflow_fbytes = sflow_fbytes;
    }

    public int getSflow_bpackets() {
        return sflow_bpackets;
    }

    public void setSflow_bpackets(int sflow_bpackets) {
        this.sflow_bpackets = sflow_bpackets;
    }

    public int getSflow_bbytes() {
        return sflow_bbytes;
    }

    public void setSflow_bbytes(int sflow_bbytes) {
        this.sflow_bbytes = sflow_bbytes;
    }

    public int getFpsh_cnt() {
        return fpsh_cnt;
    }

    public void setFpsh_cnt(int fpsh_cnt) {
        this.fpsh_cnt = fpsh_cnt;
    }

    public int getBpsh_cnt() {
        return bpsh_cnt;
    }

    public void setBpsh_cnt(int bpsh_cnt) {
        this.bpsh_cnt = bpsh_cnt;
    }

    public int getFurg_cnt() {
        return furg_cnt;
    }

    public void setFurg_cnt(int furg_cnt) {
        this.furg_cnt = furg_cnt;
    }

    public int getBurg_cnt() {
        return burg_cnt;
    }

    public void setBurg_cnt(int burg_cnt) {
        this.burg_cnt = burg_cnt;
    }

    public int getTotal_fhlen() {
        return total_fhlen;
    }

    public void setTotal_fhlen(int total_fhlen) {
        this.total_fhlen = total_fhlen;
    }

    public int getTotal_bhlen() {
        return total_bhlen;
    }

    public void setTotal_bhlen(int total_bhlen) {
        this.total_bhlen = total_bhlen;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "total_fpackets=" + total_fpackets +
                ", total_fvolume=" + total_fvolume +
                ", total_bpackets=" + total_bpackets +
                ", total_bvolume=" + total_bvolume +
                ", min_fpktl=" + min_fpktl +
                ", mean_fpktl=" + mean_fpktl +
                ", max_fpktl=" + max_fpktl +
                ", std_fpktl=" + std_fpktl +
                ", min_bpktl=" + min_bpktl +
                ", mean_bpktl=" + mean_bpktl +
                ", max_bpktl=" + max_bpktl +
                ", std_bpktl=" + std_bpktl +
                ", min_fiat=" + min_fiat +
                ", mean_fiat=" + mean_fiat +
                ", max_fiat=" + max_fiat +
                ", std_fiat=" + std_fiat +
                ", min_biat=" + min_biat +
                ", mean_biat=" + mean_biat +
                ", max_biat=" + max_biat +
                ", std_biat=" + std_biat +
                ", duration=" + duration +
                ", min_active=" + min_active +
                ", mean_active=" + mean_active +
                ", max_active=" + max_active +
                ", std_active=" + std_active +
                ", min_idle=" + min_idle +
                ", mean_idle=" + mean_idle +
                ", max_idle=" + max_idle +
                ", std_idle=" + std_idle +
                ", sflow_fpackets=" + sflow_fpackets +
                ", sflow_fbytes=" + sflow_fbytes +
                ", sflow_bpackets=" + sflow_bpackets +
                ", sflow_bbytes=" + sflow_bbytes +
                ", fpsh_cnt=" + fpsh_cnt +
                ", bpsh_cnt=" + bpsh_cnt +
                ", furg_cnt=" + furg_cnt +
                ", burg_cnt=" + burg_cnt +
                ", total_fhlen=" + total_fhlen +
                ", total_bhlen=" + total_bhlen +
                '}';
    }
}
