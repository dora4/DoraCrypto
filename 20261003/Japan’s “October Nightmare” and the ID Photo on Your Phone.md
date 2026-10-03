# Japan’s “October Nightmare” and the ID Photo on Your Phone

## —When university classes are suspended, government networks are hacked, and a car rental firm gets breached twice: what should we think about storing files in the cloud?

On October 2, the computer systems of Osaka Metropolitan University in Japan suffered a full-scale outage. The official website went offline, the academic administration system crashed, and all classes that day were urgently canceled.

This was no isolated incident. Three days prior, Times Car, Japan’s largest car-sharing operator, disclosed a leak of roughly 6.6 million user records, including 1.6 million scanned driver’s licenses. Even earlier, Japan’s internal government network GSS was compromised, exposing personal data of around 246,000 public servants. Attackers had gained access to the system on June 25, yet authorities only announced the breach on September 11 — a gap of 78 days.

Within three days, government, corporate and academic sectors — seemingly unrelated — were compromised by the same core risk: **If you do not control your data, you do not control its security.**

You may think this is far removed from your life. Consider this scenario instead:
Do you have front-and-back photos of your ID card saved in your phone album? Scanned copies of contracts tucked in your WeChat favorites? Backups of your child’s birth certificate or your parents’ medical reports stored in a cloud drive?

You do not need to be one of those 6.6 million victims to run into serious trouble if any of this information leaks. You only need to be yourself.

## In 2026, “where to store your files” has become a real dilemma

Ten years ago, this was hardly a concern. Files sat close at hand on USB sticks, external hard drives or your computer’s D drive.

Five years ago, it was still a minor issue. Cloud storage was convenient, free and offered abundant space. “Moving files to the cloud” was seen as progress.

But in 2026, the landscape has shifted. It is not that cloud drives have gotten worse; threats have multiplied, grown more sophisticated and strike faster.

According to the mid-year vulnerability report released by Qi An Xin this year, 35,467 new vulnerabilities were discovered worldwide in the first half of the year, a year-on-year increase of 51.9%. High-risk and critical vulnerabilities account for more than half of all flaws. 30.2% of high-risk vulnerabilities are exploited on the very day they are disclosed, and 83.7% come under attack within 21 days.

What does this mean? The window between the discovery of a vulnerability and attackers weaponizing it against you has shrunk to a timeframe too short to respond.

And your files rest on the servers of some cloud provider, waiting to be caught in the fallout of such vulnerabilities.

## Three common security misconceptions about mainstream cloud storage

### Misconception 1: “Transport encryption means full end-to-end safety”

TLS encryption protects data while it is *in transit*. But what happens once your files reach the server? Storage-layer encryption policies vary widely between providers. More importantly, the encryption keys are held by the service provider. Provider staff, their AI systems, or anyone who breaches their infrastructure may gain access to your files.

### Misconception 2: “Big companies equal strong security”

The breach of Japan’s GSS network demonstrates that larger organizations have bigger attack surfaces, longer internal data workflows, and higher risks of insider threats or human error. The 2026 special campaign for personal information protection explicitly lists “severe punishment for industry insiders abusing data access” as a priority — proof that the problem has grown severe enough to require targeted enforcement.

### Misconception 3: “I have nothing worth stealing”

Do you have any of these on your phone?

- ID card photos (raw material for identity theft)
- Screenshots of bank cards (material for targeted phishing)
- Employment contracts (highly sought after by competitors)
- Photos of your children and their school details (entry points for social engineering)
- Medical examination reports (sensitive health data of interest to insurers and employers)

Leakage of any single item can lead to targeted scam calls haunting you for the next year.

## DoraCloud’s approach: Return data ownership to users

**DoraCloud** is a privacy-focused storage tool for personal users, for sensitive private data and ordinary files. Its fundamental difference from mainstream cloud storage is not richer features or a better UI, but an architectural choice:
**Who holds the encryption keys?**

With mainstream cloud services, the provider holds them. With DoraCloud, *you* hold them.

Breaking this down:

1. **Client-side encryption, zero knowledge on the server**
   Your files are encrypted locally on your device *before upload*. DoraCloud servers only store encrypted ciphertext. The provider does not possess decryption keys and cannot view your file contents. Even if the server is compromised, attackers will only obtain unintelligible encrypted data.
2. **Tiered storage with differentiated protection**
   DoraCloud splits your files into two layers:

- **Private data layer**: ID cards, contracts, medical records, financial documents, protected by top-tier encryption with keys managed entirely locally.
- **General file layer**: Photos, documents and everyday files, using an encryption scheme balancing performance and security.

The two layers use separate encryption policies and storage paths. Your ID photos should not share the same security level as your travel snapshots — DoraCloud lets you treat them differently.

3. **Transparent audits and verifiable commitments**
   DoraCloud publishes regular transparency reports, disclosing data requests, security incidents and system audit findings. You cannot trust a black-box system — but you can trust a system open to inspection.

## New October rules: Regulation is tightening, yet you remain the first party responsible for your data

The *Measures for the Supervision and Inspection of Cyberspace Security by Public Security Organs* took effect on October 1. The rules explicitly include “proper implementation of algorithm security primary responsibilities” as a key inspection item, covering internet service providers, network operators, data processors and handlers of personal information.

South Korea has introduced even stricter new rules: firms leaking personal data of over 10 million people may face fines up to 10% of their revenue (previously capped at 3%).

Regulation worldwide is growing stricter. This is positive. But regulation always acts after the fact — it intervenes only once your data has already leaked.

**Before regulation catches up, before your files are lost, you need to take charge of your own data.**

DoraCloud does not require you to give up cloud convenience. You can still sync files seamlessly across phones, tablets and computers. You can still share files with colleagues or friends (supporting burn-after-reading, access passwords and expiry controls).

The difference: your files are encrypted on your device, and only you can decrypt them. DoraCloud acts merely as a “delivery worker”: it transports your locked box from point A to point B, yet never knows what is inside.

## One action you can take right now

Open your phone album and search for “ID card”.

Check how many photos you find, when they were taken, where they are stored, and who may be able to access them.

If the answer is “saved in my photo gallery, WeChat or some cloud drive”, and you cannot confirm whether they are encrypted —
That is when DoraCloud is for you.

Not out of fear. Out of common sense.

**DoraCloud — Your files, your control.**

*DoraCloud is part of the Dora product family, dedicated to secure storage for private and general files.*